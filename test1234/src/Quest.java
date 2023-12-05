
public class Quest {
	public int stringCount(String text, String search) {
		int answer = 0;
		int i = 0;
		while (true) {
			if (text.indexOf(search, i) == -1)
				break;
			else {
				i = text.indexOf(search, i) + 1;
				answer++;
			}
		}
		return answer;
	}
}
