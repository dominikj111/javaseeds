/**
 * This class is generated by jOOQ
 */
package com.hellokoding.jooq.model.dbo;


import com.hellokoding.jooq.model.dbo.tables.Author;
import com.hellokoding.jooq.model.dbo.tables.Sysdiagrams;
import com.hellokoding.jooq.model.dbo.tables.records.AuthorRecord;
import com.hellokoding.jooq.model.dbo.tables.records.SysdiagramsRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>dbo</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> PK_AUTHOR = UniqueKeys0.PK_AUTHOR;
    public static final UniqueKey<SysdiagramsRecord> PK_SYSDIAGRAMS = UniqueKeys0.PK_SYSDIAGRAMS;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AuthorRecord> PK_AUTHOR = createUniqueKey(Author.AUTHOR, "PK_author", Author.AUTHOR.ID, Author.AUTHOR.ID, Author.AUTHOR.ID, Author.AUTHOR.ID, Author.AUTHOR.ID, Author.AUTHOR.ID, Author.AUTHOR.ID);
        public static final UniqueKey<SysdiagramsRecord> PK_SYSDIAGRAMS = createUniqueKey(Sysdiagrams.SYSDIAGRAMS, "PK_sysdiagrams", Sysdiagrams.SYSDIAGRAMS.DIAGRAM_ID, Sysdiagrams.SYSDIAGRAMS.DIAGRAM_ID, Sysdiagrams.SYSDIAGRAMS.DIAGRAM_ID, Sysdiagrams.SYSDIAGRAMS.DIAGRAM_ID, Sysdiagrams.SYSDIAGRAMS.DIAGRAM_ID, Sysdiagrams.SYSDIAGRAMS.DIAGRAM_ID, Sysdiagrams.SYSDIAGRAMS.DIAGRAM_ID);
    }
}
