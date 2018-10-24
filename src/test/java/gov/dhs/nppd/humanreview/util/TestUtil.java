package gov.dhs.nppd.humanreview.util;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import org.openapitools.client.model.HumanReviewItem;
import org.openapitools.client.model.HumanReviewItem.ActionEnum;
import org.threeten.bp.OffsetDateTime;

public class TestUtil {
	public static final String FIELD_NAMES[] = { "Description", "Title", "Short_Description", "Header Description",
			"Header Title" };

	public static final String OBJECT_TYPES[] = { "Indicator", "Observable", "Package", "TTP", "CoA" };

	public static final String FIELD_VALUES[] = { "Confidence (08082016)", "PII presents",
			"Single Indicator: NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f", "Package with single indicator\n"
					+ " NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f at\n" + " 2016-08-05T10:59:23Z" };

	public static HumanReviewItem makeHrItem() {
		HumanReviewItem hrItem = new HumanReviewItem();
		List<String> fieldNames = new LinkedList<String>(Arrays.asList(FIELD_NAMES));
		List<String> fieldValues = new LinkedList<String>(Arrays.asList(FIELD_VALUES));

		hrItem.setStixId(getStixId());
		hrItem.setAction(getActionEnum());
		hrItem.setDate(getDateTime());
		hrItem.setObjectType(getObjectType());
		hrItem.setStatus("New");

		hrItem.setFieldName(getFieldName(fieldNames));
		hrItem.setFieldValue(getFieldValue(fieldValues));
		return hrItem;
	}

	private static String getObjectType() {
		return OBJECT_TYPES[(int) (OBJECT_TYPES.length * Math.random())];
	}

	private static String getFieldValue(List<String> fieldValues) {
		return fieldValues.remove((int) (fieldValues.size() * Math.random()));
	}

	private static String getFieldName(List<String> fieldNames) {
		return fieldNames.remove((int) (fieldNames.size() * Math.random()));
	}

	private static OffsetDateTime getDateTime() {
		return OffsetDateTime.now();
	}

	private static ActionEnum getActionEnum() {
		return ActionEnum.BLANK;
	}

	private static String getStixId() {
		return UUID.randomUUID().toString();
	}

}
