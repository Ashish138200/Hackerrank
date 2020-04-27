#one test case failed
z=input()
l=list(z.split())
x1=int(l[0])
x2=int(l[1])
x3=int(l[2])
ma=max(max(x1,x2),x3) #sort(l)
mi=min(min(x2,x2),x3)  #ma=[len(l)-1] and mi=[0]
print(ma-mi)        #print(int(ma)-int(mi))

#all passed
z=input()
l=list(z.split())
for i in range(0,len(l)):
    l[i]=int(l[i])
l.sort()
mi=int(l[0])
ma=int(l[2])
print(ma-mi)