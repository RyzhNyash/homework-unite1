package by.ld.unit01.main;

public class Task06 {

	public static void main(String[] args) {
		
// В n малых бидонах 80л молока. Сколько литров молока в m больших бидонов, если в каждом большом бидоне на 12 л. больше,
// чем в малом.
		
		double n = 4; // число малых бидонов
		double m = 1; // число больших бидонов
		
		double v1; //объем малого бидона
		double v2; // объем большого бидона, в задаче вроде бы "v1 + 12"
		
		double sumv1 = 80; // общий объем малых бидонов, в задаче 80л
		double sumv2; // общий объем больших бидонов
		
		v1 = sumv1 / n;
		
		v2 = v1 + 12; // условие задачи, обьем каждого большого бидона на 12 больше чем малого
		
		sumv2 = m * v2;
			
		System.out.println("литров в больших бидонах при текущих данных: " + sumv2 );
	
	}

}
