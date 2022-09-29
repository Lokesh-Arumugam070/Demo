package conditioalstatement;

public class Elseif {
public static void main(String args[])
{
	double ratings =3.5;
	if(ratings>=5)
	{ 
		System.out.println("very good");
	}
	else if(ratings==4)
	{ 
		System.out.println("good");
	}
	else if(ratings<4 || ratings>=3)
	{ 
		System.out.println("average");
	}
	else
	{ 
		System.out.println("poor");
	}
}
}
