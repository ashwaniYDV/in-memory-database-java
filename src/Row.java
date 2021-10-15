import java.util.Date;
import java.util.HashMap;

public class Row {
    private String rowId;
    private HashMap<String, String> columnValuesMap;
    private Date createdAt;
    private Date updatedAt;

    public Row(String rowId, HashMap<String, String> columnsMap, Date createdAt, Date updatedAt) {
        this.rowId = rowId;
        this.columnValuesMap = columnsMap;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public HashMap<String, String> getColumnValuesMap() {
        return columnValuesMap;
    }

    public void setColumnValuesMap(HashMap<String, String> columnValuesMap) {
        this.columnValuesMap = columnValuesMap;
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        UpdatedAt = updatedAt;
    }
}