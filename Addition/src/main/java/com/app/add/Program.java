package com.app.add;

import java.util.ArrayList;
import java.util.List;

public class Program {


	public static int validate(String number) throws Exception
	{
		int res = 0;

		if (String.valueOf(number).matches("^null|$")) {
			return 0;
		}
		String str[] = number.split("[\\s\r\n,|.;]");
		List<Integer> ls = new ArrayList<Integer>();
		for (String s : str) {

			if (s.equals(""))
				continue;

			res = Integer.parseInt(s);

			if (res < 0) {
				ls.add(res);
			}

		}
		if (ls.isEmpty())
			return -1;
		else
			throw new Exception("negatives not allowed" + ls.toString());
	}


	public static int add(String num) throws Exception {

		int sum=0,res=0;
		if(validate(num)==-1)
		{
			String str[] = num.split("[\\s\r\n,|.;]");
			for (String s : str) {

				if (s.equals(""))
					continue;

				res = Integer.parseInt(s);
				sum+=res;

			}
		}
		return sum;

	}

}