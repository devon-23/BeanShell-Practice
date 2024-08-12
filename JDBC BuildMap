### JDBC BuildMap Rule Overview:
- **Purpose**: Manipulates raw data from rows and columns in a file to build a map from the incoming data.
- **Execution**: Runs within the virtual appliance, often used for connector-related functions. Logs are accessible to SailPoint personnel.
  
### Inputs & Outputs:
- **Input**: Includes `ResultSet`, `Connection`, `Map`, `Application`, and `Schema` objects.
- **Output**: Produces a `Map` of names/values representing a row of data from the JDBC resource.

### Example Rule:
- **Functionality**: Example replaces the "status" value with a Boolean "inactive" attribute in the map, then removes "status."

<?xml version='1.0' encoding='UTF-8'?>
<!DOCTYPE Rule PUBLIC "sailpoint.dtd" "sailpoint.dtd">
<Rule name="Example Rule" type="JDBCBuildMap">
  <Description>
This basic rule performs the default mapping and then replaces the “status” value read from the database with a
Boolean “inactive” attribute in the map.
  </Description>
    <Source><![CDATA[
       import sailpoint.connector.*;
       Map map = JDBCConnector.buildMapFromResultSet(result, schema);
       String status = (String) map.get("status");
       if( "inactive".equals(status) ) {
            map.put("inactive", true);
       } else {
            map.put("inactive", false);
       }
       map.remove("status");
       return map;
    ]]></Source>
</Rule>
