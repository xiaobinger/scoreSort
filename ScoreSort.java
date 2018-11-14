import java.util.Scanner;
@SuppressWarnings("resource")
	public static void main(String[] args){
		while(true){
			 Scanner sc=new Scanner(System.in);
			    int n=sc.nextInt();
			    int type=sc.nextInt();
			    if(type!=1&&type!=0){
		    		System.out.println("输入不合法！！");
		    		return;
		    	}
			    String[] names=new String[n];
			    int[] scores=new int[n];
			    int[] index=new int[n];
			    for(int i=0;i<n;i++){
			    	String temp=sc.next()+" "+sc.next();
			    	if(!temp.contains(" ")){
			    		System.out.println("输入不合法！！");
			    		return;
			    	}
			    	String[] nameAndScore=temp.split(" ");
			    	names[i]=nameAndScore[0];
			    	scores[i]=Integer.parseInt(nameAndScore[1]);
			    	index[i]=i;
			    	if(i>0){
			    		if(type==1){
			    			for(int j=0;j<i;j++){
			    				if(scores[i]<scores[j]){
			    					int tempScore=scores[i];
			    	    			scores[i]=scores[j];
			    	    			scores[j]=tempScore;
			    	    			String tempName=names[i];
			    	    			names[i]=names[j];
			    	    			names[j]=tempName;
			    	    			int tempIndex=index[i];
			    	    			index[i]=index[j];
			    	    			index[j]=tempIndex;
			    				}
			    			}
			    			
			    		}else if(type==0){
			    			for(int j=0;j<i;j++){
			    				if(scores[i]>scores[j]){
			    					int tempScore=scores[i];
			    	    			scores[i]=scores[j];
			    	    			scores[j]=tempScore;
			    	    			String tempName=names[i];
			    	    			names[i]=names[j];
			    	    			names[j]=tempName;
			    	    			int tempIndex=index[i];
			    	    			index[i]=index[j];
			    	    			index[j]=tempIndex;
			    				}
			    			}
			    		}
			    	}
			    }
			    
			    
			    for(int i=0;i<n-1;i++){
			    	if(scores[i]==scores[i+1]&&index[i]>index[i+1]){
			    		int tempScore=scores[i];
		    			scores[i]=scores[i+1];
		    			scores[i+1]=tempScore;
		    			String tempName=names[i];
		    			names[i]=names[i+1];
		    			names[i+1]=tempName;
		    			int tempIndex=index[i];
		    			index[i]=index[i+1];
		    			index[i+1]=tempIndex;
			    	}
			    }
			    
			    for(int i=0;i<n;i++){
			    	System.out.println(names[i]+" "+scores[i]);
			    }
		}
	   
	}
