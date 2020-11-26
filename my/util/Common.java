package my.util;
import java.util.*;
public class Common{
	//配列の中身をシャッフルするメソッド
	public static void arrShuffle(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int index=new Random().nextInt(arr.length-i);
			int temp=arr[index];
			arr[index]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
	//配列のクローンを返すメソッド
	public static int[] arrClone(int[] arr){
		int[] cloneArr=new int[arr.length];
		for(int i=0;i<cloneArr.length;i++){
			cloneArr[i]=arr[i];
		}
		return cloneArr;
	}
	//配列を昇順に並べ替えるメソッド
	public static int[]arrSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}
		return arr;
	}
	//配列を降順に並べるメソッド
	public static int[] arrSort(int[] arr,boolean isDesc){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}
		return arr;
	}
	//要素数と指定範囲を受け取り、指定範囲の値で埋め尽くされた配列を返すメソッド
	public static int[] arrRandomRange(int min,int max,int count){
		int range=max-min+1;
		int[] arr=new int[count];
		for(int i=0;i<count;i++){
			arr[i]=new Random().nextInt(range)+min;
		}
		return arr;
	}
}
