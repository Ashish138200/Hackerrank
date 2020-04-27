# two cases failed
x=input()
l=list(x.split(" "))
n=int(l[0])
m=int(l[1])
a=int(l[2])
b=int(l[3])
k=m/b #price per m ride
cost1=n*k
cost2=n*a
min_cost=int(min(cost1,cost2))
cost=0
for i in range(0,n):
    for j in range(0,n):
        if(i+j)==n :
            cost=a*i + k*j
print(int(min(min_cost,cost)))