int size=40
CSG cube = new Cube(	size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
for (int i = 0; i < 10; i += 1)
{
	cube=cube.union(
		new Cube(	size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
			.rotz(i*10)
			.movex(i*5.5)
			.movez(i*5)
			
	)
}

return cube