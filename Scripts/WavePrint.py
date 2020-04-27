z=input()
l0=list(z.split(" "))
m=int(l0[0])
n=int(l0[1])
l=[]
for i in range(m):          # A for loop for row entries
    a =[]
    for j in range(n):      # A for loop for column entries
         a.append(input())
    l.append(a)
# For printing the matrix
for i in range(m):
    for j in range(n):
        print(l[i][j],end = " ")
    print()
