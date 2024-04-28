package hollow.consumer.api.generated.core;

import com.netflix.hollow.api.custom.HollowTypeAPI;
import com.netflix.hollow.api.objects.provider.HollowFactory;
import com.netflix.hollow.core.read.dataaccess.HollowTypeDataAccess;
import com.netflix.hollow.core.type.*;
import hollow.consumer.api.generated.Movie;
import hollow.consumer.api.generated.collections.*;
import hollow.consumer.api.generated.core.*;

@SuppressWarnings("all")
public class MovieHollowFactory<T extends Movie> extends HollowFactory<T> {

    @Override
    public T newHollowObject(HollowTypeDataAccess dataAccess, HollowTypeAPI typeAPI, int ordinal) {
        return (T)new Movie(((MovieTypeAPI)typeAPI).getDelegateLookupImpl(), ordinal);
    }

    @Override
    public T newCachedHollowObject(HollowTypeDataAccess dataAccess, HollowTypeAPI typeAPI, int ordinal) {
        return (T)new Movie(new MovieDelegateCachedImpl((MovieTypeAPI)typeAPI, ordinal), ordinal);
    }

}