#2 test cases failed
n=int(input())
x=input()
ai=list(x.split(" "))
l=len(ai)
for i in range(0,n):
    ai[i]=int(ai[i])
max=0
s=0
for i in range(0,n):
    if(ai[i]>max):
        max=ai[i]
        s=s+ai[i]
print(n*max-s)