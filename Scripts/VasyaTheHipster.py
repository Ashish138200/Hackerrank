x=input()
l=list(x.split())
a=int(l[0]) #red
b=int(l[1]) #blue
if(a>b):
    #swapping
    a=a+b
    b=a-b
    a=a-b
res=(b-a)/2
print(a,int(res))