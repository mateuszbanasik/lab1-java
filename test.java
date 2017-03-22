
public class test {
	static punkty punkt1;
	static punkty punkt2;
		public static void main(String[] args) {
			{
				//tworzê obiekt z konstruktorem domyœlnym.
				punkt1 = new punkty();
				punkt1.momentBezwladnosci();
				punkt1.getInfo();
	
			//tworzê obiekt z konstruktorem z paramterami
			punkt2 = new punkty(2,45);
			//zmieniam mase za pomoc¹ akcesora
			punkt2.setMasa(25);
			punkt2.momentBezwladnosci();
			punkt2.twSteinera(34);
			punkt2.getInfo();
			punkt2.getTwSteinera();
			punkty[] punkt3 = new punkty[4]; // tablica 6 obiektow klasy pkt
			
			
			
			
			for(int i = 0; i<punkt3.length; i++)
			{
		 punkt3[i] = new punkty(Math.pow(i,i),i+10); // losowanie wartosci promienia i masy ( zeby nie bylo nudno)
			}
			
			for(int i =0; i<punkt3.length;i++) // stosowanie metod dla poszczegolnych obiektow
			{
				punkt3[i].momentBezwladnosci();
				punkt3[i].getInfo();
				punkt3[i].twSteinera(Math.random());
				punkt3[i].getTwSteinera();
			}
			
			}
			
			
		}

	
}
