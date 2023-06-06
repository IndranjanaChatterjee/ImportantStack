import java.util.*;
public class bracketcheck
{
    char stack[]=new char[10];
    int top;
    bracketcheck()
    {
        top=-1;
    }

    void push(char x)
    {
        top++;
        stack[top]=x;
    }

    char pop()
    {
        return (stack[top--]);
    }

    int check(char st[])
    {
        char ch,ch1;
        int i,l;
        l=st.length;
        
        for(i=0;i<st.length;i++)
        {
            ch=st[i];
            if(ch=='('||ch=='{'||ch=='[')
            {
                push(ch);
            }
            else
            {
                ch1=pop();
                if(ch==')'&& ch1=='(')
                {
                    continue;
                }
                else if(ch=='}'&& ch1=='{')
                {
                    continue;
                }
                else if(ch==']'&& ch1=='[')
                {
                    continue;
                }
                else
                {
                    return 0;
                }

            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        String st;
        Scanner in=new Scanner(System.in);
        System.out.println("enter");
        st=in.next();
        bracketcheck ob=new bracketcheck();
        int k;
        char cc[]=st.toCharArray();
        k=ob.check(cc);
        if(k==1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        
    }

}