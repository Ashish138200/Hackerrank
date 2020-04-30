s=input()
s1='hello'
f=0
j=0
for i in range(len(s)):
        if s[i] == s1[j]:
            j+=1
            f+=1
            if(f==5):
                break
if f==5 :
    print("YES")
else:
    print("NO")