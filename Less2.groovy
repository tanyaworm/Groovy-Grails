// serialize
import groovy.json.JsonBuilder
stuff = [[ID:1, name:'TvSet',color:'black',size:42,count:2],
         [ID:2, name:'LapTop',color:'white',size:17.3,count:2],
         [ID:3, name:'PocketPC',color:'grey',size:7,count:1],
         [ID:4, name:'PlayStation',color:'silver',size:'unknown',count:1], 
         [ID:5, name:'Clock',color:'black',size:'unknown',count:2],       
]
//Part 1 of task
def JsonStr='{\"Stuff\" : [\n'
builder = new JsonBuilder()
stuff.each {builder(it)
JsonStr+=builder.toString()+','+'\n'}

def tail  = {it.size() > 1 ? it[0..-3] : ''}
println tail(JsonStr)+']}'

println ()

//Part 2 of task
def search = stuff.findAll {it.count > 1 && it.color == 'black'}
search.each {println "$it.ID: $it.name"}

def search1 = stuff.find {it.color.startsWith('b')}
println search1.ID +" "+search1.name+" "+search1.size


 



