#one test case failed
s=input()
a,b=s.split()
k=int(a) #117
r=int(b) #3
s=0
while((s*k-r)%10!=0):
    s=s+1
    if((s*k)%10==0):
        s=((s*k)/k)
        break
print(int(s))