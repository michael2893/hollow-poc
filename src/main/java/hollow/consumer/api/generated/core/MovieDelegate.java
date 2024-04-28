package hollow.consumer.api.generated.core;

import com.netflix.hollow.api.objects.delegate.HollowObjectDelegate;
import com.netflix.hollow.core.type.*;
import hollow.consumer.api.generated.collections.*;
import hollow.consumer.api.generated.core.*;


@SuppressWarnings("all")
public interface MovieDelegate extends HollowObjectDelegate {

    public int getId(int ordinal);

    public Integer getIdBoxed(int ordinal);

    public String getTitle(int ordinal);

    public boolean isTitleEqual(int ordinal, String testValue);

    public int getTitleOrdinal(int ordinal);

    public int getActorsOrdinal(int ordinal);

    public MovieTypeAPI getTypeAPI();

}