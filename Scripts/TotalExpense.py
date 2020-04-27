#1 test case fail
n=int(input())
for i in range(0,n):
    a,b=input().split()
    d=0
    q=int(a)
    p=int(b)
    if(q>1000):
        d=0.1
    dis=int(q*p*d)
    amt=int(q*p-dis)
    aa=str(amt)
    print(aa+'.000000')