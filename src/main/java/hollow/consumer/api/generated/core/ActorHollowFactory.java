package hollow.consumer.api.generated.core;

import com.netflix.hollow.api.custom.HollowTypeAPI;
import com.netflix.hollow.api.objects.provider.HollowFactory;
import com.netflix.hollow.core.read.dataaccess.HollowTypeDataAccess;
import com.netflix.hollow.core.type.*;
import hollow.consumer.api.generated.Actor;
import hollow.consumer.api.generated.collections.*;
import hollow.consumer.api.generated.core.*;

@SuppressWarnings("all")
public class ActorHollowFactory<T extends Actor> extends HollowFactory<T> {

    @Override
    public T newHollowObject(HollowTypeDataAccess dataAccess, HollowTypeAPI typeAPI, int ordinal) {
        return (T)new Actor(((ActorTypeAPI)typeAPI).getDelegateLookupImpl(), ordinal);
    }

    @Override
    public T newCachedHollowObject(HollowTypeDataAccess dataAccess, HollowTypeAPI typeAPI, int ordinal) {
        return (T)new Actor(new ActorDelegateCachedImpl((ActorTypeAPI)typeAPI, ordinal), ordinal);
    }

}