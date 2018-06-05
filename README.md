# SpringBasicScopes

When defining a <bean> you have the option of declaring a scope for that bean. 
For example, to force Spring to produce a new bean instance each time one is needed,
you should declare the bean's scope attribute to be prototype. 
Similarly, if you want Spring to return the same bean instance each time one is needed,
you should declare the bean's scope attribute to be singleton.

