

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 4) ������, �������, �������, ���������� � ����� ����� � �������
�� �������� �����. ��� ������ ������� ������ ����� ���� ��
������������� � ��� ���������� � ����� �������, ��� �� ������ ���
���������. �������� ��������� ������� ������� �� �����
��������� ������� � ����������� �� ���� ������� �������� ����
����� ������� � �������� ��������. �������� ���� ���� ������
������ ��� �������, �� ������� �������� ���:
[Volovitc, Kutrapalli, Penny,Sheldon,Sheldon,Leonard,Leonard]
		 */
		
		Buyers buyersOne = new Buyers("Sheldon");
		Buyers buyersTwo = new Buyers("Leonard");
		Buyers buyersTree = new Buyers("Volovitc");
		Buyers buyersFour = new Buyers("Kutrapalli");
		Buyers buyersFive = new Buyers("Penny");
		
		ColaSale colaSale = new ColaSale();
		colaSale.addBuyers(buyersOne);
		colaSale.addBuyers(buyersTwo);
		colaSale.addBuyers(buyersTree);
		colaSale.addBuyers(buyersFour);
		colaSale.addBuyers(buyersFive);
		
		
		System.out.println(colaSale);
		
		colaSale.buyCola(3);
		System.out.println(colaSale);
		
		
		

	}

}
