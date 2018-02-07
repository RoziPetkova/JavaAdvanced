package p04Telephony;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smatrphone implements Callable, Browseble {

	@Override
	public void brows(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			try {
				visitSite(list.get(i));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
	}

	@Override
	public void call(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			try {
				callNumber(list.get(i));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
	}

	private void callNumber(String number){
		Pattern pattern = Pattern.compile("[^0-9]");
		Matcher match = pattern.matcher(number);
		if (match.find())
			throw new IllegalArgumentException("Invalid number!");
		System.out.println("Calling... " + number);
	}

	private void visitSite(String site){
		Pattern pattern = Pattern.compile("[0-9]");
		Matcher match = pattern.matcher(site);
		if (match.find())
			throw new IllegalArgumentException("Invalid URL!");
		System.out.println("Browsing: " + site + "!");
	}
}
