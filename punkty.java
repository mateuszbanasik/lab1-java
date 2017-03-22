
public class punkty {

	private double masa;
		private double promien;
		private double mBez = 0;
		private double twSteiner;
		public punkty()
		{
			this.masa=15;
					this.promien=5;
			
		}
		public punkty(double masa, double promien)
		{
			this.masa = masa;
			this.promien = promien;
			
		}
		
		public void setMasa(double masa)
		{
			this.masa = masa;
		}
		
		
		public void setR(double promien)
		{
			this.promien = promien;
		}
		public double getMasa()
		{
			return this.masa;
			
		}
		public double getR()
		{
			return this.promien;
		}
		
		public void momentBezwladnosci()
		{
			this.mBez = masa*Math.pow(promien, 2);
		}
		public double getMoment()
		{
			return this.mBez;
		}
		public void getInfo()
		{
			System.out.println("Punkt o masie : "  + getMasa() + " i promieniu : " + getR() + "Moment bezwladnosci : " +getMoment() );
		}
		
		public void twSteinera(double odlegosc)
		{
			this.twSteiner = this.mBez + (this.masa * Math.pow(odlegosc, 2));
		}
		public void getTwSteinera()
		{
			System.out.println("Z twierdzenia Steinera moment bezwladnosci jest rowny : "  +this.twSteiner);
		}
		
		
		
	}
