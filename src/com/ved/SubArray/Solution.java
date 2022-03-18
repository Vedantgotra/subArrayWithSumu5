package com.ved.SubArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
   static ArrayList<String> list =new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int c=0;
            String s="";
            boolean b=false;
            for(int i=0;i<n;i++)
            {
                for(int j=i;j<n;j++)
                {
                    for(int k=i;k<=j;k++)
                    {
                        c=c+a[k];
                        s=s+Integer.toString(a[k])+" ";
                    }
                    if(c==5)
                    {
                        check(s);
                        b=true;
                    }
                    c=0;
                    s="";
                }
            }
            if(b)
            {
                System.out.println(list.get(0));
            }
            else
            {
                System.out.println(-1);
            }
        }
        catch (Exception e)
        {
            System.out.println(-1);
        }

    }
    static void check(String s)
    {
        if(list.isEmpty())
        {
            list.add(s);
        }
        else {
            for(int i=0;i<list.size();i++)
            {
                if(list.get(i).length()>s.length())
                {
                    list.remove(i);
                    list.add(s);
                }
            }
        }
    }
}
