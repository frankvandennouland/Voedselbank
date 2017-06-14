package voedselbank;

/**
 *
 * @author Niek van der Starre
 */
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TextfieldLimit extends PlainDocument {
    
  private int limit;

  TextfieldLimit(int limit) {
   super();
   this.limit = limit;
   }

  @Override
  public void insertString( int offset, String  str, AttributeSet attr ) throws BadLocationException {
    if (str == null) return;

    if ((getLength() + str.length()) <= limit) {
      super.insertString(offset, str, attr);
    }
  }
}