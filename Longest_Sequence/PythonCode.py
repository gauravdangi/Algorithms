l = 0
start=0
end=0
def longest(stri,a,b):
    if(stri>l):
        start = a
        end = b

print("Enter String")
s = input()
i=0
while i<len(s): #{
   x=i
   y=i
   le=1
   while chr(ord(s[i]) + 1) == chr(ord(s[i+1])):
       le = le+1
       i=i+1
       y=i
       if i==len(s):
           break
   longest(le,x,y)
   i=i+1
       
    
#}
    
for k in range(start,end):
    print(s[k])

print("END")


    
    
       
