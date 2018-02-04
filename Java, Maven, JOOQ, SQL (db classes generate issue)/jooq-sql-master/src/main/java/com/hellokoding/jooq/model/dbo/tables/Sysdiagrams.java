/**
 * This class is generated by jOOQ
 */
package com.hellokoding.jooq.model.dbo.tables;


import com.hellokoding.jooq.model.dbo.Dbo;
import com.hellokoding.jooq.model.dbo.Keys;
import com.hellokoding.jooq.model.dbo.tables.records.SysdiagramsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sysdiagrams extends TableImpl<SysdiagramsRecord> {

    private static final long serialVersionUID = -1387860755;

    /**
     * The reference instance of <code>dbo.sysdiagrams</code>
     */
    public static final Sysdiagrams SYSDIAGRAMS = new Sysdiagrams();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysdiagramsRecord> getRecordType() {
        return SysdiagramsRecord.class;
    }

    /**
     * The column <code>dbo.sysdiagrams.name</code>.
     */
    public final TableField<SysdiagramsRecord, Object> NAME = createField("name", org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * The column <code>dbo.sysdiagrams.principal_id</code>.
     */
    public final TableField<SysdiagramsRecord, Object> PRINCIPAL_ID = createField("principal_id", org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * The column <code>dbo.sysdiagrams.diagram_id</code>.
     */
    public final TableField<SysdiagramsRecord, Object> DIAGRAM_ID = createField("diagram_id", org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * The column <code>dbo.sysdiagrams.version</code>.
     */
    public final TableField<SysdiagramsRecord, Object> VERSION = createField("version", org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * The column <code>dbo.sysdiagrams.definition</code>.
     */
    public final TableField<SysdiagramsRecord, byte[]> DEFINITION = createField("definition", org.jooq.impl.SQLDataType.VARBINARY.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARBINARY)), this, "");

    /**
     * Create a <code>dbo.sysdiagrams</code> table reference
     */
    public Sysdiagrams() {
        this("sysdiagrams", null);
    }

    /**
     * Create an aliased <code>dbo.sysdiagrams</code> table reference
     */
    public Sysdiagrams(String alias) {
        this(alias, SYSDIAGRAMS);
    }

    private Sysdiagrams(String alias, Table<SysdiagramsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sysdiagrams(String alias, Table<SysdiagramsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SysdiagramsRecord> getPrimaryKey() {
        return Keys.PK_SYSDIAGRAMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SysdiagramsRecord>> getKeys() {
        return Arrays.<UniqueKey<SysdiagramsRecord>>asList(Keys.PK_SYSDIAGRAMS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sysdiagrams as(String alias) {
        return new Sysdiagrams(alias, this);
    }

    /**
     * Rename this table
     */
    public Sysdiagrams rename(String name) {
        return new Sysdiagrams(name, null);
    }
}