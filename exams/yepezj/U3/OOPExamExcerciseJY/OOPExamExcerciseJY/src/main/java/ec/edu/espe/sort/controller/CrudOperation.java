
package ec.edu.espe.sort.controller;

import java.util.List;

/**
 *
 * @author Jefferson Yepez - Bit Coderz - DCCO ESPE
 */

public interface CrudOperation<T> {
    public List<T> readJSONListGeneric(String collectionName, Class<T> classTarget);
    public void saveCollection(List<T> templateList, String collectionName);
}
