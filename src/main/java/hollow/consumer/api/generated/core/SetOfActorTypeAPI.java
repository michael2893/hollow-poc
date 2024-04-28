package hollow.consumer.api.generated.core;

import com.netflix.hollow.api.custom.HollowSetTypeAPI;
import com.netflix.hollow.api.objects.delegate.HollowSetLookupDelegate;
import com.netflix.hollow.core.read.dataaccess.HollowSetTypeDataAccess;
import com.netflix.hollow.core.type.*;
import hollow.consumer.api.generated.MovieAPI;
import hollow.consumer.api.generated.collections.*;
import hollow.consumer.api.generated.core.*;

@SuppressWarnings("all")
public class SetOfActorTypeAPI extends HollowSetTypeAPI {

    private final HollowSetLookupDelegate delegateLookupImpl;

    public SetOfActorTypeAPI(MovieAPI api, HollowSetTypeDataAccess dataAccess) {
        super(api, dataAccess);
        this.delegateLookupImpl = new HollowSetLookupDelegate(this);
    }

    public ActorTypeAPI getElementAPI() {
        return getAPI().getActorTypeAPI();
    }

    public MovieAPI getAPI() {
        return (MovieAPI)api;
    }

    public HollowSetLookupDelegate getDelegateLookupImpl() {
        return delegateLookupImpl;
    }

}