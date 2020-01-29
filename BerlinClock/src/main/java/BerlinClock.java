
public class BerlinClock {
	public static String clock(String time) {

		String str[] = time.split(":");

		int hrs = Integer.parseInt(str[0]);
		int min = Integer.parseInt(str[1]);
		int sec = Integer.parseInt(str[2]);
		String thr = getTopHours(hrs);
		String bhr =getBottomHours(hrs);
		
		String tmm = getTopMinutes(min);
		String bmm = getBottomMinutes(min);
		
		String ss = getSeconds(sec);
		
		String formattedTime = ss + thr + bhr + tmm + bmm ;
		return formattedTime;

	}

	private static String getSeconds(int sec) {
		if (sec % 2 == 0)
			return "Y";
		else
			return "O";
	}

	private static String getTopHours(int hrs) {
		int que = hrs / 5;
		String[] topMinLamps = {"O","O","O","O"};
		return calculateFormattedHours(que, topMinLamps,"R");
	}
	
	private static String getBottomHours(int hrs) {
		int rem = hrs % 5 ;
		String[] topMinLamps = {"O","O","O","O"};
		return  calculateFormattedHours(rem, topMinLamps,"R");
		
	}

	private static String getTopMinutes(int min) {
		 int que = min / 5;
		 String[] topMinLamps = {"O","O","O","O","O","O","O","O","O","O","O"};
		 String minutes = calculateFormattedHours(que,topMinLamps,"Y");	
		 StringBuilder sb = new StringBuilder();
			for(int i=0; i < minutes.length();i++)
			{
				if((i+1) % 3 == 0 && minutes.charAt(i) != 'O')
				{
					sb.append("R");
				}
				else if( minutes.charAt(i) == 'O' ) {
					sb.append("O");
				}else
					sb.append("Y");
			}
		 return sb.toString();
			}

	private static String getBottomMinutes(int min) {
		int rem = min % 5 ;
		String[] topMinLamps = {"O","O","O","O"};
		return calculateFormattedHours(rem, topMinLamps,"Y");
		
	}
	private static String calculateFormattedHours(int rem, String[] topHourLamps, String string) {
		for(int i=0; i < rem;i++)
		{
			topHourLamps[i] = string;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i <= topHourLamps.length -1; i++)
		{
			sb.append(topHourLamps[i]);
		}
		
		return sb.toString();
	}

}
