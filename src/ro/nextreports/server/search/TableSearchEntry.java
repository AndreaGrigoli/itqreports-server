/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.nextreports.server.search;

import org.apache.wicket.model.StringResourceModel;

public class TableSearchEntry extends SearchEntry {
        
    private Tristate table;

    public Tristate getTable() {
        return table;
    }

    public void setTable(Tristate table) {
        this.table = table;
    }  

    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("* ").append(new StringResourceModel("ActionContributor.Search.entry.table", null).getString()).append(" = '");                
        sb.append(table.getName());
        sb.append("'");
        return sb.toString();
    }
}
