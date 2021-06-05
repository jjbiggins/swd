# Wiki

## [\#]()Contents <a id="toc"></a>

```text
ToC = {
    '1. Collections': [List, Dictionary, Set, Tuple, Range, Enumerate, Iterator, Generator],
    '2. Types':       [Type, String, Regular_Exp, Format, Numbers, Combinatorics, Datetime],
    '3. Syntax':      [Args, Inline, Closure, Decorator, Class, Duck_Type, Enum, Exception],
    '4. System':      [Exit, Print, Input, Command_Line_Arguments, Open, Path, OS_Commands],
    '5. Data':        [JSON, Pickle, CSV, SQLite, Bytes, Struct, Array, Memory_View, Deque],
    '6. Advanced':    [Threading, Operator, Introspection, Metaprograming, Eval, Coroutine],
    '7. Libraries':   [Progress_Bar, Plot, Table, Curses, Logging, Scraping, Web, Profile,
                       NumPy, Image, Audio, Games, Data, Cython]
}
```

## [\#]()Main <a id="main"></a>

```text
if __name__ == '__main__':     
    main()
```

## [\#]()List <a id="list"></a>

```text
 = [from_inclusive : to_exclusive : ±step_size]
```

```text
.append()            
.extend()    
```

```text
.sort()
.reverse()
 = sorted()
 = reversed()
```

```text
sum_of_elements  = sum()
elementwise_sum  = [sum(pair) for pair in zip(list_a, list_b)]
sorted_by_second = sorted(, key=lambda el: el[1])
sorted_by_both   = sorted(, key=lambda el: (el[1], el[0]))
flatter_list     = list(itertools.chain.from_iterable())
product_of_elems = functools.reduce(lambda out, el: out * el, )
list_of_chars    = list()
```

* **Module** [**operator**]() **provides functions itemgetter\(\) and mul\(\) that offer the same functionality as** [**lambda**]() **expressions above.**

```text
 = .count()     
index = .index()     
.insert(index, )     
 = .pop([index])     
.remove()            
.clear()                 
```

## [\#]()Dictionary <a id="dictionary"></a>

```text
 = .keys()                          
 = .values()                        
 = .items()                         
```

```text
value  = .get(key, default=None)          
value  = .setdefault(key, default=None)   
 = collections.defaultdict()        
 = collections.defaultdict(lambda: 1)     
```

```text
 = dict()                     
 = dict(zip(keys, values))                
 = dict.fromkeys(keys [, value])          
```

```text
.update()                           
value = .pop(key)                         
{k for k, v in .items() if v == value}    
{k: v for k, v in .items() if k in keys}  
```

### Counter <a id="counter"></a>

```text
>>> from collections import Counter
>>> colors = ['blue', 'blue', 'blue', 'red', 'red']
>>> counter = Counter(colors)
>>> counter['yellow'] += 1
Counter({'blue': 3, 'red': 2, 'yellow': 1})
>>> counter.most_common()[0]
('blue', 3)
```

```text
.add()                                 
.update()                      
```

```text
  = .union()                   
  = .intersection()            
  = .difference()              
  = .symmetric_difference()    
 = .issubset()                
 = .issuperset()              
```

```text
 = .pop()                              
.remove()                              
.discard()                             
```

### Frozen Set <a id="frozenset"></a>

* **Is immutable and hashable.**
* **That means it can be used as a key in a dictionary or as an element in a set.**

```text
 = frozenset()
```

## [\#]()Tuple <a id="tuple"></a>

**Tuple is an immutable and hashable list.**

```text
 = ()
 = (, )
 = (,  [, ...])
```

### Named Tuple <a id="namedtuple"></a>

**Tuple's subclass with named elements.**

```text
>>> from collections import namedtuple
>>> Point = namedtuple('Point', 'x y')
>>> p = Point(1, y=2)
Point(x=1, y=2)
>>> p[0]
1
>>> p.x
1
>>> getattr(p, 'y')
2
>>> p._fields  
('x', 'y')
```

## [\#]()Range <a id="range"></a>

```text
 = range(to_exclusive)
 = range(from_inclusive, to_exclusive)
 = range(from_inclusive, to_exclusive, ±step_size)
```

```text
from_inclusive = .start
to_exclusive   = .stop
```

## [\#]()Enumerate <a id="enumerate"></a>

```text
for i, el in enumerate( [, i_start]):
    ...
```

## [\#]()Iterator <a id="iterator"></a>

```text
 = iter()                 
 = iter(, to_exclusive)     
   = next( [, default])           
 = list()                       
```

### Itertools <a id="itertools"></a>

```text
from itertools import count, repeat, cycle, chain, islice
```

```text
 = count(start=0, step=1)             
 = repeat( [, times])             
 = cycle()                
```

```text
 = chain(,  [, ...])  
 = chain.from_iterable()  
```

```text
 = islice(, to_exclusive)
 = islice(, from_inclusive, to_exclusive [, +step_size])
```

## [\#]()Generator <a id="generator"></a>

* **Any function that contains a yield statement returns a generator.**
* **Generators and iterators are interchangeable.**

```text
def count(start, step):
    while True:
        yield start
        start += step
```

```text
>>> counter = count(10, 2)
>>> next(counter), next(counter), next(counter)
(10, 12, 14)
```

## [\#]()Type <a id="type"></a>

* **Everything is an object.**
* **Every object has a type.**
* **Type and class are synonymous.**

```text
 = type()                          
 = isinstance(, )            
```

```text
>>> type('a'), 'a'.__class__, str
(<class 'str'>, <class 'str'>, <class 'str'>)
```

#### Some types do not have built-in names, so they must be imported: <a id="sometypesdonothavebuiltinnamessotheymustbeimported"></a>

```text
from types import FunctionType, MethodType, LambdaType, GeneratorType
```

### Abstract Base Classes <a id="abstractbaseclasses"></a>

**Each abstract base class specifies a set of virtual subclasses. These classes are then recognized by isinstance\(\) and issubclass\(\) as subclasses of the ABC, although they are really not.**

```text
>>> from collections.abc import Sequence, Collection, Iterable
>>> isinstance([1, 2, 3], Iterable)
True
```

```text
┏━━━━━━━━━━━━━━━━━━┯━━━━━━━━━━━━┯━━━━━━━━━━━━┯━━━━━━━━━━━━┓
┃                  │  Sequence  │ Collection │  Iterable  ┃
┠──────────────────┼────────────┼────────────┼────────────┨
┃ list, range, str │     ✓      │     ✓      │     ✓      ┃
┃ dict, set        │            │     ✓      │     ✓      ┃
┃ iter             │            │            │     ✓      ┃
┗━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━┷━━━━━━━━━━━━┷━━━━━━━━━━━━┛
```

```text
>>> from numbers import Integral, Rational, Real, Complex, Number
>>> isinstance(123, Number)
True
```

```text
┏━━━━━━━━━━━━━━━━━━━━┯━━━━━━━━━━┯━━━━━━━━━━┯━━━━━━━━━━┯━━━━━━━━━━┯━━━━━━━━━━┓
┃                    │ Integral │ Rational │   Real   │ Complex  │  Number  ┃
┠────────────────────┼──────────┼──────────┼──────────┼──────────┼──────────┨
┃ int                │    ✓     │    ✓     │    ✓     │    ✓     │    ✓     ┃
┃ fractions.Fraction │          │    ✓     │    ✓     │    ✓     │    ✓     ┃
┃ float              │          │          │    ✓     │    ✓     │    ✓     ┃
┃ complex            │          │          │          │    ✓     │    ✓     ┃
┃ decimal.Decimal    │          │          │          │          │    ✓     ┃
┗━━━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┛
```

## [\#]()String <a id="string"></a>

```text
  = .strip()                       
  = .strip('')              
```

```text
 = .split()                       
 = .split(sep=None, maxsplit=-1)  
 = .splitlines(keepends=False)    
  = .join()       
```

```text
 =  in                   
 = .startswith()         
 = .endswith()           
  = .find()               
  = .index()              
```

```text
  = .replace(old, new [, count])   
  = .translate()              = chr()                            = ord()                          Also: 'lstrip()', 'rstrip()'.Also: 'lower()', 'upper()', 'capitalize()' and 'title()'.Property Methods┏━━━━━━━━━━━━━━━┯━━━━━━━━━━┯━━━━━━━━━━┯━━━━━━━━━━┯━━━━━━━━━━┯━━━━━━━━━━┓┃               │ [ !#$%…] │ [a-zA-Z] │  [¼½¾]   │  [²³¹]   │  [0-9]   ┃┠───────────────┼──────────┼──────────┼──────────┼──────────┼──────────┨┃ isprintable() │    ✓     │    ✓     │    ✓     │    ✓     │    ✓     ┃┃ isalnum()     │          │    ✓     │    ✓     │    ✓     │    ✓     ┃┃ isnumeric()   │          │          │    ✓     │    ✓     │    ✓     ┃┃ isdigit()     │          │          │          │    ✓     │    ✓     ┃┃ isdecimal()   │          │          │          │          │    ✓     ┃┗━━━━━━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┛Also: 'isspace()' checks for '[ \t\n\r\f\v…]'.#Regeximport re   = re.sub(, new, text, count=0)    = re.findall(, text)              = re.split(, text, maxsplit=0)   = re.search(, text)              = re.match(, text)                = re.finditer(, text)           Search() and match() return None if they can't find a match.Argument 'flags=re.IGNORECASE' can be used with all functions.Argument 'flags=re.MULTILINE' makes '^' and '$' match the start/end of each line.Argument 'flags=re.DOTALL' makes dot also accept the '\n'.Use r'\1' or '\\1' for backreference.Add '?' after an operator to make it non-greedy.Match Object   = .group()                         = .group(1)                      = .groups()                        = .start()                         = .end()                        Special SequencesBy default digits, alphanumerics and whitespaces from all alphabets are matched, unless 'flags=re.ASCII' argument is used.Use a capital letter for negation.'\d' == '[0-9]'                                '\w' == '[a-zA-Z0-9_]'                         '\s' == '[ \t\n\r\f\v]'                        #Format = f'{}, {}' = '{}, {}'.format(, )Attributes>>> from collections import namedtuple>>> Person = namedtuple('Person', 'name height')>>> person = Person('Jean-Luc', 187)>>> f'{person.height}''187'>>> '{p.height}'.format(p=person)'187'General Options{:<10}                                     {:^10}                                     {:>10}                                     {:.<10}                                    {:<0}                                      Strings'!r' calls object's repr() method, instead of str(), to get a string.{'abcde'!r:10}                                 {'abcde':10.3}                                 {'abcde':.3}                                   Numbers{ 123456:10,}                                  { 123456:10_}                                  { 123456:+10}                                  {-123456:=10}                                  { 123456: }                                    {-123456: }                                    Floats{1.23456:10.3}                                 {1.23456:10.3f}                                {1.23456:10.3e}                                {1.23456:10.3%}                                Comparison of presentation types:┏━━━━━━━━━━━━━━━┯━━━━━━━━━━━━━━━━━┯━━━━━━━━━━━━━━━━━┯━━━━━━━━━━━━━━━━━┯━━━━━━━━━━━━━━━━━┓┃               │    {}    │   {:f}   │   {:e}   │   {:%}   ┃┠───────────────┼─────────────────┼─────────────────┼─────────────────┼─────────────────┨┃   0.000056789 │    '5.6789e-05' │     '0.000057'  │  '5.678900e-05' │     '0.005679%' ┃┃   0.00056789  │    '0.00056789' │     '0.000568'  │  '5.678900e-04' │     '0.056789%' ┃┃   0.0056789   │    '0.0056789'  │     '0.005679'  │  '5.678900e-03' │     '0.567890%' ┃┃   0.056789    │    '0.056789'   │     '0.056789'  │  '5.678900e-02' │     '5.678900%' ┃┃   0.56789     │    '0.56789'    │     '0.567890'  │  '5.678900e-01' │    '56.789000%' ┃┃   5.6789      │    '5.6789'     │     '5.678900'  │  '5.678900e+00' │   '567.890000%' ┃┃  56.789       │   '56.789'      │    '56.789000'  │  '5.678900e+01' │  '5678.900000%' ┃┃ 567.89        │  '567.89'       │   '567.890000'  │  '5.678900e+02' │ '56789.000000%' ┃┗━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━┛┏━━━━━━━━━━━━━━━┯━━━━━━━━━━━━━━━━━┯━━━━━━━━━━━━━━━━━┯━━━━━━━━━━━━━━━━━┯━━━━━━━━━━━━━━━━━┓┃               │   {:.2}  │  {:.2f}  │  {:.2e}  │  {:.2%}  ┃┠───────────────┼─────────────────┼─────────────────┼─────────────────┼─────────────────┨┃   0.000056789 │    '5.7e-05'    │       '0.00'    │    '5.68e-05'   │       '0.01%'   ┃┃   0.00056789  │    '0.00057'    │       '0.00'    │    '5.68e-04'   │       '0.06%'   ┃┃   0.0056789   │    '0.0057'     │       '0.01'    │    '5.68e-03'   │       '0.57%'   ┃┃   0.056789    │    '0.057'      │       '0.06'    │    '5.68e-02'   │       '5.68%'   ┃┃   0.56789     │    '0.57'       │       '0.57'    │    '5.68e-01'   │      '56.79%'   ┃┃   5.6789      │    '5.7'        │       '5.68'    │    '5.68e+00'   │     '567.89%'   ┃┃  56.789       │    '5.7e+01'    │      '56.79'    │    '5.68e+01'   │    '5678.90%'   ┃┃ 567.89        │    '5.7e+02'    │     '567.89'    │    '5.68e+02'   │   '56789.00%'   ┃┗━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━┛#NumbersTypes      = int()           = float()         = complex(real=0, imag=0)      = fractions.Fraction(0, 1)      = decimal.Decimal()  'int()' and 'float()' raise ValueError on malformed strings.Decimal numbers can be represented exactly, unlike floats where '1.1 + 2.2 != 3.3'.Precision of decimal operations is set with: 'decimal.getcontext().prec ='.Basic Functions = pow(, )                 = abs()                        = round( [, ±ndigits])        Mathfrom math import e, pi, inf, nan, isinf, isnanfrom math import cos, acos, sin, asin, tan, atan, degrees, radiansfrom math import log, log10, log2Statisticsfrom statistics import mean, median, variance, stdev, pvariance, pstdevRandomfrom random import random, randint, choice, shuffle = random()   = randint(from_inclusive, to_inclusive)    = choice()shuffle()Bin, Hex        = ±0b                          = int('±', 2)                  = int('±0b', 0)        '[-]0b' = bin()                Bitwise Operators        =  &                      =  |                      =  ^                      =  << n_bits                   = ~                    #CombinatoricsEvery function returns an iterator.If you want to print the iterator, you need to pass it to the list() function first!from itertools import product, combinations, combinations_with_replacement, permutations>>> product([0, 1], repeat=3)[(0, 0, 0), (0, 0, 1), (0, 1, 0), (0, 1, 1), (1, 0, 0), (1, 0, 1), (1, 1, 0), (1, 1, 1)]>>> product('ab', '12')[('a', '1'), ('a', '2'), ('b', '1'), ('b', '2')]>>> combinations('abc', 2)[('a', 'b'), ('a', 'c'), ('b', 'c')]>>> combinations_with_replacement('abc', 2)[('a', 'a'), ('a', 'b'), ('a', 'c'), ('b', 'b'), ('b', 'c'), ('c', 'c')]>>> permutations('abc', 2)[('a', 'b'), ('a', 'c'), ('b', 'a'), ('b', 'c'), ('c', 'a'), ('c', 'b')]#DatetimeModule 'datetime' provides 'date', 'time', 'datetime' and 'timedelta' classes. All are immutable and hashable.Time and datetime objects can be 'aware' , meaning they have defined timezone, or 'naive', meaning they don't.If object is naive, it is presumed to be in the system's timezone.from datetime import date, time, datetime, timedeltafrom dateutil.tz import UTC, tzlocal, gettz, resolve_imaginaryConstructors  = date(year, month, day)  = time(hour=0, minute=0, second=0, microsecond=0, tzinfo=None, fold=0) = datetime(year, month, day, hour=0, minute=0, second=0, ...) = timedelta(days=0, seconds=0, microseconds=0, milliseconds=0, minutes=0, hours=0, weeks=0)Use '.weekday()' to get the day of the week (Mon == 0).'fold=1' means the second pass in case of time jumping back for one hour.' = resolve_imaginary()' fixes DTs that fall into the missing hour.Now  = D/DT.today()                         = DT.utcnow()                          = DT.now()                 To extract time use '.time()', '.time()' or '.timetz()'.Timezone = UTC                               = tzlocal()                         = gettz('/')          = .astimezone()         = .replace(tzinfo=)  Encode = D/T/DT.fromisoformat('')         = DT.strptime(, '')     = D/DT.fromordinal()              = DT.fromtimestamp()             = DT.fromtimestamp(, )  ISO strings come in following forms: 'YYYY-MM-DD', 'HH:MM:SS.ffffff[±]', or both separated by an arbitrary character. Offset is formatted as: 'HH:MM'.Epoch on Unix systems is: '1970-01-01 00:00 UTC', '1970-01-01 01:00 CET', …Decode    = .isoformat(sep='T')          = .strftime('')        = .toordinal()                 = .timestamp()                  = .timestamp()                Format>>> from datetime import datetime>>> dt = datetime.strptime('2015-05-14 23:39:00.00 +0200', '%Y-%m-%d %H:%M:%S.%f %z')>>> dt.strftime("%A, %dth of %B '%y, %I:%M%p %Z")"Thursday, 14th of May '15, 11:39PM UTC+02:00"When parsing, '%z' also accepts '±HH:MM'.For abbreviated weekday and month use '%a' and '%b'.Arithmetics   =    ±  # Returned datetime can fall into missing hour. = - = - = -#ArgumentsInside Function Call()                  ()                     (, )  Inside Function Definitiondef f():                      def f():                         def f(, ):      #Splat OperatorInside Function CallSplat expands a collection into positional arguments, while splatty-splat expands a dictionary into keyword arguments.args   = (1, 2)kwargs = {'x': 3, 'y': 4, 'z': 5}func(*args, **kwargs)Is the same as:func(1, 2, x=3, y=4, z=5)Inside Function DefinitionSplat combines zero or more positional arguments into a tuple, while splatty-splat combines zero or more keyword arguments into a dictionary.def add(*a):    return sum(a)>>> add(1, 2, 3)6Legal argument combinations:def f(x, y, z):                def f(*, x, y, z):             def f(x, *, y, z):             def f(x, y, *, z):             def f(*args):                  def f(x, *args):               def f(*args, z):               def f(x, *args, z):            def f(**kwargs):               def f(x, **kwargs):            def f(*, x, **kwargs):         def f(*args, **kwargs):        def f(x, *args, **kwargs):     def f(*args, y, **kwargs):     def f(x, *args, z, **kwargs):  Other Uses  = [* [, ...]]   = {* [, ...]} = (*, [...])  = {** [, ...]}head, *body, tail = #InlineLambda = lambda:  = lambda , : Comprehensions = [i+1 for i in range(10)]                     = {i for i in range(10) if i > 5}             = (i+5 for i in range(10))                    = {i: i*2 for i in range(10)}                out = [i+j for i in range(10) for j in range(10)]Is the same as:out = []for i in range(10):    for j in range(10):        out.append(i+j)Map, Filter, Reducefrom functools import reduce = map(lambda x: x + 1, range(10))             = filter(lambda x: x > 5, range(10))           = reduce(lambda out, x: out + x, range(10))  Any, All = any()                           = all(el[1] for el in )          If - Else =  if  else >>> [a if a else 'zero' for a in (0, 1, 2, 3)]['zero', 1, 2, 3]Namedtuple, Enum, Dataclassfrom collections import namedtuplePoint     = namedtuple('Point', 'x y')point     = Point(0, 0)from enum import EnumDirection = Enum('Direction', 'n e s w')direction = Direction.nfrom dataclasses import make_dataclassCreature  = make_dataclass('Creature', ['location', 'direction'])creature  = Creature(Point(0, 0), Direction.n)#ClosureWe have a closure in Python when:A nested function references a value of its enclosing function and thenthe enclosing function returns the nested function.def get_multiplier(a):    def out(b):        return a * b    return out>>> multiply_by_3 = get_multiplier(3)>>> multiply_by_3(10)30If multiple nested functions within enclosing function reference the same value, that value gets shared.To dynamically access function's first free variable use '.__closure__[0].cell_contents'.Partialfrom functools import partial = partial( [, , , ...])>>> import operator as op>>> multiply_by_3 = partial(op.mul, 3)>>> multiply_by_3(10)30Partial is also useful in cases when function needs to be passed as an argument, because it enables us to set its arguments beforehand.A few examples being: 'defaultdict()', 'iter(, to_exclusive)' and dataclass's 'field(default_factory=)'.Non-LocalIf variable is being assigned to anywhere in the scope, it is regarded as a local variable, unless it is declared as a 'global' or a 'nonlocal'.def get_counter():    i = 0    def out():        nonlocal i        i += 1        return i    return out>>> counter = get_counter()>>> counter(), counter(), counter()(1, 2, 3)#DecoratorA decorator takes a function, adds some functionality and returns it.@decorator_namedef function_that_gets_passed_to_decorator():    ...Debugger ExampleDecorator that prints function's name every time it gets called.from functools import wrapsdef debug(func):    @wraps(func)    def out(*args, **kwargs):        print(func.__name__)        return func(*args, **kwargs)    return out@debugdef add(x, y):    return x + yWraps is a helper decorator that copies the metadata of the passed function (func) to the function it is wrapping (out).Without it 'add.__name__' would return 'out'.LRU CacheDecorator that caches function's return values. All function's arguments must be hashable.from functools import lru_cache@lru_cache(maxsize=None)def fib(n):    return n if n < 2 else fib(n-2) + fib(n-1)CPython interpreter limits recursion depth to 1000 by default. To increase it use 'sys.setrecursionlimit()'.Parametrized DecoratorA decorator that accepts arguments and returns a normal decorator that accepts a function.from functools import wrapsdef debug(print_result=False):    def decorator(func):        @wraps(func)        def out(*args, **kwargs):            result = func(*args, **kwargs)            print(func.__name__, result if print_result else '')            return result        return out    return decorator@debug(print_result=True)def add(x, y):    return x + y#Classclass <name>:    def __init__(self, a):        self.a = a    def __repr__(self):        class_name = self.__class__.__name__        return f'{class_name}({self.a!r})'    def __str__(self):        return str(self.a)    @classmethod    def get_class_name(cls):        return cls.__name__Return value of repr() should be unambiguous and of str() readable.If only repr() is defined, it will also be used for str().Str() use cases:print()print(f'{}')raise Exception()loguru.logger.debug()csv.writer().writerow([])Repr() use cases:print([])print(f'{!r}')>>> loguru.logger.exception()Z = dataclasses.make_dataclass('Z', ['a']); print(Z())Constructor Overloadingclass <name>:    def __init__(self, a=None):        self.a = aInheritanceclass Person:    def __init__(self, name, age):        self.name = name        self.age  = ageclass Employee(Person):    def __init__(self, name, age, staff_num):        super().__init__(name, age)        self.staff_num = staff_numMultiple Inheritanceclass A: passclass B: passclass C(A, B): passMRO determines the order in which parent classes are traversed when searching for a method:>>> C.mro()[<class 'C'>, <class 'A'>, <class 'B'>, <class 'object'>]PropertyPythonic way of implementing getters and setters.class MyClass:    @property    def a(self):        return self._a    @a.setter    def a(self, value):        self._a = value>>> el = MyClass()>>> el.a = 123>>> el.a123DataclassDecorator that automatically generates init(), repr() and eq() special methods.from dataclasses import dataclass, field@dataclass(order=False, frozen=False)class <class_name>:    :     :  =     : list/dict/set = field(default_factory=list/dict/set)Objects can be made sortable with 'order=True' and/or immutable and hashable with 'frozen=True'.Function field() is needed because ': list = []' would make a list that is shared among all instances.Default_factory can be any callable.Inline:from dataclasses import make_dataclass = make_dataclass('', ) = make_dataclass('', ) = ('',  [, ])SlotsMechanism that restricts objects to attributes listed in 'slots' and significantly reduces their memory footprint.class MyClassWithSlots:    __slots__ = ['a']    def __init__(self):        self.a = 1Copyfrom copy import copy, deepcopy
```

