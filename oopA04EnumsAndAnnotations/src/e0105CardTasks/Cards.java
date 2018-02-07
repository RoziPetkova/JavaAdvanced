package e0105CardTasks;

import e0105CardTasks.enums.Rank;
import e0105CardTasks.enums.Suit;

public interface Cards {
	
	
	public void setRank(Rank rank);
	public void setSuit(Suit suit);
	public Rank getRank();
	public String getCardName();
	public int getCardPower();
}
