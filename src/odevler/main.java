package odevler;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		System.out.println("Merhaba D�nya");
		
		System.out.println(
				"Merhaba Java"
				);
		
		int ogrenciSayisi = 14;
		String ogrenci ="��renci Say�s� : ";
		
		System.out.println(ogrenci + ogrenciSayisi );
		System.out.println(ogrenci + ogrenciSayisi);
		System.out.println("��renci Say�m : "+ ogrenciSayisi);
		System.out.println("��renci Say�m : "+ ogrenciSayisi);
		
		int sayilar = 28;
		byte sayi = 127;
		double sayilar1 = 34.2567;
		sayi = 40;
		sayilar = 39;
		sayilar1 = 2.53;
		
		String tc = "17317813742";
		
		char karakter = 'B';
		
		boolean dogruMu=true;
		
		if(sayilar<40) {
			System.out.println("Say� 40 tan k���kt�r");
		}
		else if(sayilar>40) {
			System.out.println("Say� 40 tan b�y�kt�r");
		}
		else {
			System.out.println("Say� 40 a e�ittir");
		}
		
		int sayi1 = 22;
		int sayi2 = 14;
		int sayi3 = 7;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En B�y�k = " +enBuyuk);

		char ogrenciNotu = 'C';
		
		switch(ogrenciNotu) {
		case 'A' :
			System.out.println("M�kemmel : Ge�tiniz");
			break;
		case 'B' :
			System.out.println("�yi : Ge�tiniz");
			break;
		case 'C' :
			System.out.println("Orta : Ge�tiniz");
			break;
		case 'D' :
			System.out.println("Maalesef : B�t�nleme");
			break;
		case 'E' :
			System.out.println("Maalesef : Kald�n�z");
			break;
		case 'F' :
			System.out.println("Berbat : Kald�n�z");
			break;
		default:
				System.out.println("Ge�ersiz Not Giri�i");
		}
		
		
		//For
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("For D�ng� Bitti");
		
		for(int i=1;i<15;i+=2) {
			System.out.println(i);
		}
		System.out.println("For Tek Say� D�ng� Bitti");
		
		//While
		int i=1;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("While D�ng� Bitti");
		
		//Do-While
		
		int j=100;
		do {
			System.out.println(j);
			j+=2;
		}
		while(j<10); {
			System.out.println("Do-While D�ng� Bitti");
		}
		
		String ogrenci1 = "Ahmet";
		String ogrenci2 = "Mehmet";
		String ogrenci3 = "Emre";
		String ogrenci4 = "Ekin";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("Yoklama");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Ahmet";
		ogrenciler[1]="Mehmet";
		ogrenciler[2]="Emre";
		ogrenciler[3]="Ekin";
		
		for(int i_0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for(String ogrenciler1:ogrenciler) {
			System.out.println(ogrenciler1);
		}
		
		double[] myList = {1.2,3.4,5.6,7.8,9.1};
		double total=0;
		double max = myList[0];
		for(double number:myList) {
			if(max<number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		
		System.out.println("Toplam = " + total);
		System.out.println("En B�y�k = " + max);
		
		
		String[][] sehirler1=new String[3][3];
		
		sehirler1[0][0] = "�stanbul";
		sehirler1[0][1] = "Bursa";
		sehirler1[0][2] = "Bilecik";
		sehirler1[1][0] = "Ankara";
		sehirler1[1][1] = "Konya";
		sehirler1[1][2] = "Kayseri";
		sehirler1[2][0] = "Diyarbak�r";
		sehirler1[2][1] = "�anl�urfa";
		sehirler1[2][2] = "Gaziantep";
		
		for(int b = 0; b<=2;b++) {
			System.out.println("-------------");
			for(int k=0;k<=2;k++) {
				System.out.println(sehirler1[b][k]);
			}
		}
		
		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman say�s� : "+ mesaj.length());
		System.out.println("5. eleman : " +mesaj.charAt(4));
		System.out.println(mesaj.concat(" Ya�as�n!"));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));
		
		String yeniMesaj = mesaj.replace(' ','-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
		int number = 48;
		int remainder = number % 2;
		System.out.println(remainder);
		
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Say� Asald�r");
			return;
		}
		
		if(number<1) {
			System.out.println("Say� Ge�ersiz.");
		}
		
		for (int l=2; l<number;l++) {
			if(number % l == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("Say� Asald�r.");
		}else{
			System.out.println("Say� Asal De�ildir.");
		}
		
		char harf='�';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kal�n Sesli Harf");
			break;
			default:
				System.out.println("�nce Sesli Harf");
			
		}
		
		
		int number2 = 5;
		int total2 = 0;
		
		for(int h=1;h<number2;h++) {
			if(number2 % h ==0) {
				total2 = total2 +h ;
			}
		}
		
		if(total2 == number2) {
			System.out.println("M�kemmel Say�d�r.");
		}else {
			System.out.println("M�kemmel Say� De�ildir.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
 }
