package petClinics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Clinic {
	
	private String name;
	private List<Room> rooms;
	final int middleRoom;
	
	public Clinic(String name, int rooms) {
		this.name = name;
		if(rooms% 2 == 0)
			throw new IllegalArgumentException("Invalid Operation!");
		this.rooms = new ArrayList<>();
		for (int i = 0; i < rooms; i++) {
			this.rooms.add(new Room());
		}
		
		middleRoom = rooms / 2;
	}

	public String getName() {
		return name;
	}

	public boolean add(Pet pet) {
		if(hasEmptyRooms()) {
			getEmptyRoom().setPet(pet);
			return true;
		}
		return false;
	}

	private Room getEmptyRoom() {
		for (int i = 0; i < rooms.size() / 2 + 1; i++) {
			Room theRoom = 
				Stream.of(rooms.get(middleRoom - i), rooms.get(middleRoom + i))
					.filter(Room::isEmpty)
					.findFirst()
					.orElse(null);

			if (theRoom == null)
				continue;
			else
				return theRoom;
		}

		return null;
	}

	public boolean release() {
		if(rooms.stream().allMatch(Room::isEmpty))
			return false;
		for (int i = middleRoom; i < rooms.size(); i++) {
			 if(!rooms.get(i).isEmpty()){
				 rooms.get(i).setPet(null);
				 return true;
			 }
		}

		for (int i = 0; i < middleRoom; i++) {
			 if(!rooms.get(i).isEmpty()){
				 rooms.get(i).setPet(null);
				 return true;
			 }
		}

		return false;
	}

	public boolean hasEmptyRooms() {
		return rooms.stream().anyMatch(Room::isEmpty);
	}

	 public void print() {
		 System.out.println(rooms.stream().map(Room::toString).collect(Collectors.joining(System.lineSeparator())).trim());
	 }

	 public void print(int roomNumber) {
	     System.out.println(this.rooms.get(roomNumber).toString());
	 }
}
