public class program_tumpukan
{	public static int N = 4;
	public static int atas = -1;

	public static void PUSH (String tumpukan[], String data)
	{	if (atas == N-1) //jika tumpukan penuh
		{	System.out.println("tumpukan penuh, PUSH " + data
					+ "  tidak dapat dilakukan");
		}
		else //jika tumpukan tidak penuh
		{	atas = atas + 1;
			tumpukan[atas] = data;
			System.out.println("PUSH " + data);
		}
	}
	public static String POP (String tumpukan[], String data)
	{	String hasil;
		if (atas < 0 ) //jika tumpukan kosong
		{	hasil = "TUMPUKAN KOSONG, POP GAGAL DILAKUKAN";
		}
		else //jika tumpukan tidak kosong
		{	hasil = tumpukan[atas];
			atas=atas-1;
			tumpukan[atas]= data;
			System.out.println("POP " + data);
		}
		return (hasil);
	}
	public static String pop (String tumpukan[])
		{	String hasil;
			if (atas < 0 ) //jika tumpukan kosong
			{	hasil = "TUMPUKAN KOSONG, POP GAGAL DILAKUKAN";
			}
			else //jika tumpukan tidak kosong
			{	hasil = tumpukan[atas];
				atas=atas-1;
			}
			return (hasil);
	}
	public static void push (String tumpukan[], String data)
		{	if (atas == N-1) //jika tumpukan penuh
			{	System.out.println("tumpukan penuh, PUSH " + data
						+ "  tidak dapat dilakukan");
			}
			else //jika tumpukan tidak penuh
			{	atas = atas + 1;
				tumpukan[atas] = data;
			}
	}
	public static void lihatTumpukan(String tumpukan[])
	{	System.out.println("");
		System.out.println("--STACK AWAL--");
		for (int i=atas;  i>=0;  i--)
		{	System.out.println(tumpukan[i]);
		}
		System.out.println("--STACK AKHIR--");
		System.out.println("");
	}

	public static void main (String[] args)
	{	String tumpukan[] = new String[10];
		PUSH(tumpukan, "I");
		PUSH(tumpukan, "D");
		PUSH(tumpukan, "T");
		PUSH(tumpukan, "U");
		PUSH(tumpukan, "O");
		lihatTumpukan(tumpukan);
		POP(tumpukan, "T");
		POP(tumpukan, "D");
		pop(tumpukan);
		push(tumpukan,"U");
		lihatTumpukan(tumpukan);
	}
}