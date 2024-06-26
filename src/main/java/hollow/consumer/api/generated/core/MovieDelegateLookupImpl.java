package hollow.consumer.api.generated.core;

import com.netflix.hollow.api.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.core.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.core.schema.HollowObjectSchema;
import com.netflix.hollow.core.type.*;
import hollow.consumer.api.generated.collections.*;
import hollow.consumer.api.generated.core.*;

@SuppressWarnings("all")
public class MovieDelegateLookupImpl extends HollowObjectAbstractDelegate implements MovieDelegate {

    private final MovieTypeAPI typeAPI;

    public MovieDelegateLookupImpl(MovieTypeAPI typeAPI) {
        this.typeAPI = typeAPI;
    }

    public int getId(int ordinal) {
        return typeAPI.getId(ordinal);
    }

    public Integer getIdBoxed(int ordinal) {
        return typeAPI.getIdBoxed(ordinal);
    }

    public String getTitle(int ordinal) {
        ordinal = typeAPI.getTitleOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isTitleEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getTitleOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getTitleOrdinal(int ordinal) {
        return typeAPI.getTitleOrdinal(ordinal);
    }

    public int getActorsOrdinal(int ordinal) {
        return typeAPI.getActorsOrdinal(ordinal);
    }

    public MovieTypeAPI getTypeAPI() {
        return typeAPI;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

}