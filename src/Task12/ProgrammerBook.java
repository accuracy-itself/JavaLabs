package Task12;

public class ProgrammerBook extends Book
{
    private String Language;
    private int Level;

    ProgrammerBook(String title, String author, int price, String language, int level)
    {
        super(title, author, price);
        Language = language;
        Level = level;
    }

    public boolean equals(Object obj)
    {
        if(!super.equals(obj))
            return false;
        
        ProgrammerBook book = (ProgrammerBook)obj;
        return this.Language == book.Language && this.Level == book.Level;
    }

    public int hashCode()
    {
        int hash = super.hashCode();
        hash = hash * 29 + Level;
        hash = hash * 29 + (Language == null ? 0 : Language.hashCode());

        return hash;
    } 

    public String toString()
    {
        return super.toString() + Language + "\n" + Integer.toString(Level) + "\n";
    }
}