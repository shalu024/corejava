class Array{
public static void main(String[] args){
int temp, i,j,k;
int[] array={1,1,1,1,0,0,1,0};
for(i=0; i<array.length-1; i++)
{ 
for(k=0; k<array.length-1; k++){	

	if (array[i]> array[i+1])
	{
			temp = array[i];
			array[i] = array[i+1];
			array[i+1] = temp;
		}
	}
}
for(j=0; j<array.length; j++)
{
	System.out.println(array[i]);
}
}
}