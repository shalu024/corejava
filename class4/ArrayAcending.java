class ArrayAcending{
public static void main(String[] args){
int temp, i,j,k;
int[] array={1,1,1,1,0,0,1,0};
for(i=0; i<array.length-1; i++)
{ 
for(k=0; k<array.length-1; k++){	

	if (array[k]> array[k+1])
	{
			temp = array[k+1];
			array[k+1] = array[k];
			array[k] = temp;
	}
}

}

for(j=0; j<array.length; j++)
{
	System.out.println(array[j]);
}
}
}