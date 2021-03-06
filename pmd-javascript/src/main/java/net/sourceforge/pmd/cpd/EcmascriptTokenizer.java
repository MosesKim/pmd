/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.cpd;

import java.util.ArrayList;

public class EcmascriptTokenizer extends AbstractTokenizer {
    public EcmascriptTokenizer() {
        // setting markers for "string" in javascript
        this.stringToken = new ArrayList<>();
        this.stringToken.add( "\'" );
        this.stringToken.add( "\"" );
        
        // setting markers for 'ignorable character' in javascript
        this.ignorableCharacter = new ArrayList<>();
        this.ignorableCharacter.add( ";" );

        // setting markers for 'ignorable string' in javascript
        this.ignorableStmt = new ArrayList<>();

        // strings do indeed span multiple lines in javascript
        this.spanMultipleLinesString = true;
        // the lines do to end with backslashes
        this.spanMultipleLinesLineContinuationCharacter = '\\';
    }
}