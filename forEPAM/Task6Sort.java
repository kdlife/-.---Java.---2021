package forEPAM;

import java.util.Arrays;

public class Task6Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("введите размер первого массива");
				int n=HelpS.getNum();
				int [] arr=new int [n];
				HelpS.fillRandomMassiv(arr);
				SortShellfull(arr);
				System.out.println(Arrays.toString(arr));
		//		SortShellfull2(arr);
		//		System.out.println(Arrays.toString(arr));
				
			
				
	}

	private static void SortShellfull2(int[] arr) { // это  из вики сортировка шелла
		// TODO Auto-generated method stub
		for (int step = arr.length / 2; step > 0; step /= 2) {
		    for (int i = step; i < arr.length; i++) {
		        for (int j = i - step; j >= 0 && arr[j] > arr[j + step] ; j -= step) {
		            int x = arr[j];
		            arr[j] = arr[j + step];
		            arr[j + step] = x;
		        }
		    }
		}
	}

	private static void SortShellfull(int[] arr) {
		// TODO Auto-gefnerated method stub
			for (int i=0;i<arr.length;i++) {
				for (int j=0;j<arr.length-3;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
								arr[j]=arr[j+1];
								arr[j+1]=temp;
								j++;
					}
					if(arr[j]<=arr[j+1]) {
				 		int temp=arr[j+2];
						arr[j+2]=arr[j+1];
								arr[j+1]=arr[j];
								arr[j]=temp;
								j--;
								}
				}
			}
		
			
						
			//if(arr[i]>arr[i+1]&&i>=1) {
		//		int temp=arr[i+1];
		//		arr[i+1]=arr[i];		
		//		arr[i+1]=temp;// поменяли местами
				
		//	}
			System.out.println(Arrays.toString(arr));
		}
			
		}
	
		
		
		
	
