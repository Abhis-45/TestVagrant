/*
		NAME:- ABHISHEK KUMAR
		COLLAGE:- DR D Y PATIL SCHOOL OF ENGINEERING ACADEMY PUNE
		YOP:- 2022
		PHONE NO. :- 9572414533
		EMAIL :- ABHISINGH12598@GMAIL.COM
*|

class Test
{
	static int carbon,nitrogen,oxygen,hydrogen,helium,methane;
	public static int  countOfMoons(int m[],boolean r[])
	{
		int res=0;
		for(int i=0;i<r.length;i++)
		{
			if(r[i]){
				res=res+m[i];
			}
		}
		return res;
	}

	public static void maxGas(String g[])
	{
		for(int i=0;i<g.length;i++)
		{
			if(g[i]=="carbon")
				carbon++;
			else if(g[i]=="nitrogen")
				nitrogen++;
			else if(g[i]=="oxygen")
				oxygen++;
			else if(g[i]=="hydrogen")
				hydrogen++;
			else if(g[i]=="helium")
				helium++;
			else if(g[i]=="methane")
				methane++;
		}
	}

	public static void main(String[] args) 
	{
		String [] planet={"mercury","venus","earth","jupitor","saturn","uranus"};
		
		String [] mercuryGasses={""};
		String [] venusGasses={"carbon","nitrogen"};
		String [] earthGasses={"nitrogen","oxygen"};
		String [] jupitorGasses={"hydrogen","helium"};
		String [] saturnGasses={"hydrogen","helium"};
		String [] uranusGasses={"hydrogen","helium","methane"};
		int [] moons={0,0,1,79,83,27};

		boolean [] rings={false,false,false,true,true,true};

		System.out.println("Total Moons : "+countOfMoons(moons,rings));

		maxGas(mercuryGasses);
		maxGas(venusGasses);
		maxGas(earthGasses);
		maxGas(jupitorGasses);
		maxGas(saturnGasses);
		maxGas(uranusGasses);

		if(carbon>=nitrogen && carbon>=oxygen && carbon>=hydrogen && carbon>=helium && carbon>=methane)
		System.out.println("Maximum gas : carbon");

		if(nitrogen>=carbon && nitrogen>=oxygen && nitrogen>=hydrogen && nitrogen>=helium && nitrogen>=methane)
		System.out.println("Maximum gas : nitrogen");

		if(oxygen>=nitrogen && oxygen>=carbon && oxygen>=hydrogen && oxygen>=helium && oxygen>=methane)
		System.out.println("Maximum gas : oxygen");

		if(hydrogen>=nitrogen && hydrogen>=oxygen && hydrogen>=carbon && hydrogen>=helium && hydrogen>=methane)
		System.out.println("Maximum gas : hydrogen");

		if(helium>=nitrogen && helium>=oxygen && helium>=hydrogen && helium>=carbon && helium>=methane)
		System.out.println("Maximum gas : helium");

		if(methane>=nitrogen && methane>=oxygen && methane>=hydrogen && methane>=helium && methane>=carbon)
		System.out.println("Maximum gas : methane");

	}
}
