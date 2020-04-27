#one test case failed
n=int(input())
a=input()
l=list(a.split())
x=int(input())
l.sort()
flag=0
if((n>=1 and n<=1000) and (x>=1 and x<=100)):
    for i in range(0,n):
        for j in range(i,n):
            a=int(l[i])
            b=int(l[j])
            if(a+b==x):
                flag=1
                print(a,b)
    if(flag==0):
        print('-1')

