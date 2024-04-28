package hollow.consumer.api.generated.core;

import com.netflix.hollow.api.objects.delegate.HollowObjectDelegate;
import com.netflix.hollow.core.type.*;
import hollow.consumer.api.generated.collections.*;
import hollow.consumer.api.generated.core.*;


@SuppressWarnings("all")
public interface ActorDelegate extends HollowObjectDelegate {

    public int getActorId(int ordinal);

    public Integer getActorIdBoxed(int ordinal);

    public String getActorName(int ordinal);

    public boolean isActorNameEqual(int ordinal, String testValue);

    public int getActorNameOrdinal(int ordinal);

    public ActorTypeAPI getTypeAPI();

}