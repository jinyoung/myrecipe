<template>

    <v-card outlined>
        <v-card-title>
            UpdateCustomer
        </v-card-title>

        <v-card-text>
            <String label="Id" v-model="value.id" :editMode="editMode"/>
            <String label="Name" v-model="value.name" :editMode="editMode"/>
            <String label="Email" v-model="value.email" :editMode="editMode"/>
            <String label="Phone" v-model="value.phone" :editMode="editMode"/>
            <String label="Address" v-model="value.address" :editMode="editMode"/>
            <String label="DietaryPreferences" v-model="value.dietaryPreferences" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="updateCustomer"
            >
                UpdateCustomer
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'UpdateCustomerCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.id = '';
            this.value.name = '';
            this.value.email = '';
            this.value.phone = '';
            this.value.address = '';
            this.value.dietaryPreferences = [];
        },
        watch: {
        },
        methods: {
            updateCustomer() {
                this.$emit('updateCustomer', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

