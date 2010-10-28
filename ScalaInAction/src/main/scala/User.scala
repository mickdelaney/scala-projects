import org.squeryl.PrimitiveTypeMode._

class User(val id: Long, val firstName: String, val lastName: String, val email: Option[String]) {
	def this() = this(0,"","",Some(""))		   
}
 
 // fields can be mutable or immutable 
 
class Book(val id: Long, 
            var title: String,
		 @Column("AUTHOR_ID") // the default 'exact match' policy can be overriden
		 var authorId: Long,
		 var coAuthorId: Option[Long]) {
   
def this() = this(0,"",0,Some(0L))
 }
 
 class Borrowal(val id: Long
                val bookId: Long
                val borrowerAccountId: Long
                val scheduledToReturnOn: Date,
                val returnedOn: Option[Timestamp],
                val numberOfPhonecallsForNonReturn: Int)
 
 object Library extends Schema {
 
   //When the table name doesn't match the class name, it is specified here :
   val authors = table[Author]("AUTHORS")

val books = table[Book]

val borrowals = table[Borrowal]
 }
