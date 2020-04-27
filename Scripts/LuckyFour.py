# 2 test case failed
n=int(input())
for i in range(0,n):
    x=int(input())
    c=0 //4
    while(x>0):
        d=x%10
        if(d==4):
            c=c+1
        x=int(x/10)
    print(c)