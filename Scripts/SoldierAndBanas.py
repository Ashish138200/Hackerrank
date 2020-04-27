s=input()
x,y,z=s.split()
k=int(x)
n=int(y)
w=int(z)
amt=0
for i in range(1,w+1):
    m=i*k
    amt=amt+m
if(amt>n):
      print (amt-n)
else:
    print ("0")