n=int(input())
s=input()
elist=list(s.split(" "))
for i in range(0,n):
    t=elist[i]
    c=0
    for j in range (0,n):
        if(t==elist[j]):
            c=c+1
    if(c!=2):
        print(t)